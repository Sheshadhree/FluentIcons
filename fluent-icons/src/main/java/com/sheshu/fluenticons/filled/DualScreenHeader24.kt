package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DualScreenHeader24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DualScreenHeader24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.995f, 7.997f)
            verticalLineTo(18.25f)
            curveToRelative(0f, 0.966f, -0.783f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-7.247f)
            curveToRelative(-0.087f, 0f, -0.172f, -0.007f, -0.255f, -0.019f)
            lineTo(12.742f, 7.997f)
            horizontalLineToRelative(9.253f)
            close()
            moveToRelative(-10.752f, 0f)
            verticalLineTo(19.98f)
            curveToRelative(-0.08f, 0.011f, -0.162f, 0.017f, -0.245f, 0.017f)
            horizontalLineTo(3.75f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.783f, -1.75f, -1.75f)
            verticalLineTo(7.997f)
            horizontalLineToRelative(9.243f)
            close()
            moveToRelative(-0.245f, -3.995f)
            curveToRelative(0.083f, 0f, 0.165f, 0.006f, 0.246f, 0.017f)
            lineToRelative(-0.001f, 2.978f)
            horizontalLineTo(2f)
            verticalLineTo(5.752f)
            curveToRelative(0f, -0.967f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(7.248f)
            close()
            moveToRelative(9.248f, 0.002f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            lineToRelative(-0.001f, 1.243f)
            horizontalLineToRelative(-9.253f)
            verticalLineTo(4.023f)
            curveToRelative(0.084f, -0.012f, 0.17f, -0.019f, 0.256f, -0.019f)
            horizontalLineToRelative(7.248f)
            close()
        }
    }.build()
}
