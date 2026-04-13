package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Lightbulb48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Lightbulb48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 18.5f)
            curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
            reflectiveCurveToRelative(12f, 5.373f, 12f, 12f)
            curveToRelative(0f, 3.504f, -1.5f, 6.657f, -3.898f, 8.852f)
            curveToRelative(-0.715f, 0.655f, -1.334f, 1.519f, -1.604f, 2.572f)
            lineTo(29.325f, 34.5f)
            horizontalLineToRelative(-10.65f)
            lineToRelative(-1.173f, -4.576f)
            curveToRelative(-0.27f, -1.053f, -0.89f, -1.917f, -1.604f, -2.572f)
            curveTo(13.501f, 25.157f, 12f, 22.004f, 12f, 18.5f)
            close()
            moveTo(19.316f, 37f)
            horizontalLineToRelative(9.368f)
            lineToRelative(-0.72f, 2.809f)
            curveToRelative(-0.255f, 0.995f, -1.152f, 1.691f, -2.18f, 1.691f)
            horizontalLineToRelative(-3.568f)
            curveToRelative(-1.028f, 0f, -1.925f, -0.696f, -2.18f, -1.691f)
            lineTo(19.316f, 37f)
            close()
            moveTo(24f, 4f)
            curveTo(15.992f, 4f, 9.5f, 10.492f, 9.5f, 18.5f)
            curveToRelative(0f, 4.235f, 1.817f, 8.047f, 4.71f, 10.696f)
            curveToRelative(0.448f, 0.41f, 0.748f, 0.873f, 0.87f, 1.349f)
            lineToRelative(2.535f, 9.885f)
            curveToRelative(0.538f, 2.1f, 2.432f, 3.57f, 4.6f, 3.57f)
            horizontalLineToRelative(3.57f)
            curveToRelative(2.168f, 0f, 4.062f, -1.47f, 4.6f, -3.57f)
            lineToRelative(2.535f, -9.885f)
            curveToRelative(0.122f, -0.476f, 0.422f, -0.938f, 0.87f, -1.35f)
            curveToRelative(2.893f, -2.648f, 4.71f, -6.46f, 4.71f, -10.695f)
            curveTo(38.5f, 10.492f, 32.008f, 4f, 24f, 4f)
            close()
        }
    }.build()
}
