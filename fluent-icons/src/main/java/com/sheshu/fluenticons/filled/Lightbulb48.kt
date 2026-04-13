package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Lightbulb48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Lightbulb48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 4f)
            curveTo(15.992f, 4f, 9.5f, 10.492f, 9.5f, 18.5f)
            curveToRelative(0f, 4.235f, 1.817f, 8.047f, 4.71f, 10.696f)
            curveToRelative(0.448f, 0.41f, 0.748f, 0.873f, 0.87f, 1.349f)
            lineToRelative(1.27f, 4.955f)
            horizontalLineToRelative(15.3f)
            lineToRelative(1.27f, -4.955f)
            curveToRelative(0.122f, -0.476f, 0.422f, -0.938f, 0.87f, -1.35f)
            curveToRelative(2.893f, -2.648f, 4.71f, -6.46f, 4.71f, -10.695f)
            curveTo(38.5f, 10.492f, 32.008f, 4f, 24f, 4f)
            close()
            moveToRelative(7.008f, 34f)
            horizontalLineTo(16.992f)
            lineToRelative(0.623f, 2.43f)
            curveToRelative(0.538f, 2.1f, 2.432f, 3.57f, 4.6f, 3.57f)
            horizontalLineToRelative(3.57f)
            curveToRelative(2.168f, 0f, 4.062f, -1.47f, 4.6f, -3.57f)
            lineTo(31.008f, 38f)
            close()
        }
    }.build()
}
