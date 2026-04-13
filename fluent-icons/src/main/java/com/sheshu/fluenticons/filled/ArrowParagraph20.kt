package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowParagraph20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowParagraph20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.25f, 2f)
            curveTo(17.664f, 2f, 18f, 2.336f, 18f, 2.75f)
            verticalLineToRelative(2.5f)
            curveTo(18f, 6.769f, 16.769f, 8f, 15.25f, 8f)
            horizontalLineToRelative(-3.805f)
            lineToRelative(1.36f, 1.495f)
            curveToRelative(0.279f, 0.307f, 0.256f, 0.781f, -0.05f, 1.06f)
            curveToRelative(-0.307f, 0.279f, -0.781f, 0.256f, -1.06f, -0.05f)
            lineToRelative(-2.5f, -2.75f)
            curveToRelative(-0.26f, -0.287f, -0.26f, -0.723f, 0f, -1.01f)
            lineToRelative(2.5f, -2.75f)
            curveToRelative(0.279f, -0.306f, 0.753f, -0.329f, 1.06f, -0.05f)
            curveToRelative(0.306f, 0.279f, 0.329f, 0.753f, 0.05f, 1.06f)
            lineTo(11.445f, 6.5f)
            horizontalLineToRelative(3.805f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-2.5f)
            curveTo(16.5f, 2.336f, 16.836f, 2f, 17.25f, 2f)
            close()
            moveTo(8.305f, 9.495f)
            curveToRelative(-0.279f, -0.306f, -0.753f, -0.329f, -1.06f, -0.05f)
            curveToRelative(-0.306f, 0.279f, -0.329f, 0.753f, -0.05f, 1.06f)
            lineTo(8.555f, 12f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 12f, 2f, 12.336f, 2f, 12.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(5.805f)
            lineToRelative(-1.36f, 1.495f)
            curveToRelative(-0.279f, 0.307f, -0.256f, 0.781f, 0.05f, 1.06f)
            curveToRelative(0.307f, 0.279f, 0.781f, 0.256f, 1.06f, -0.05f)
            lineToRelative(2.5f, -2.75f)
            curveToRelative(0.26f, -0.287f, 0.26f, -0.723f, 0f, -1.01f)
            lineToRelative(-2.5f, -2.75f)
            close()
        }
    }.build()
}
