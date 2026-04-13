package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Library16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Library16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.249f, 2f)
            curveTo(1.559f, 2f, 1f, 2.56f, 1f, 3.25f)
            verticalLineToRelative(9.495f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.249f, 1.25f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.69f, 0f, 1.248f, -0.56f, 1.248f, -1.25f)
            verticalLineTo(3.249f)
            curveTo(3.998f, 2.56f, 3.438f, 2f, 2.75f, 2f)
            horizontalLineToRelative(-0.5f)
            close()
            moveToRelative(3.997f, 0f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            verticalLineToRelative(9.495f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.689f, 0f, 1.248f, -0.56f, 1.248f, -1.25f)
            verticalLineTo(3.249f)
            curveTo(7.994f, 2.56f, 7.435f, 2f, 6.745f, 2f)
            horizontalLineToRelative(-0.5f)
            close()
            moveToRelative(5.726f, 2.777f)
            curveToRelative(-0.249f, -0.62f, -0.941f, -0.934f, -1.571f, -0.713f)
            lineTo(9.819f, 4.268f)
            curveTo(9.146f, 4.503f, 8.807f, 5.252f, 9.073f, 5.913f)
            lineToRelative(2.937f, 7.304f)
            curveToRelative(0.249f, 0.62f, 0.94f, 0.933f, 1.571f, 0.713f)
            lineToRelative(0.582f, -0.204f)
            curveToRelative(0.672f, -0.236f, 1.012f, -0.985f, 0.746f, -1.646f)
            lineToRelative(-2.937f, -7.303f)
            close()
        }
    }.build()
}
