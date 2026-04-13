package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Print24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Print24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 17.5f)
            verticalLineToRelative(1.25f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-7.5f)
            curveTo(7.007f, 21f, 6f, 19.993f, 6f, 18.75f)
            verticalLineToRelative(-1.251f)
            lineTo(4.25f, 17.5f)
            curveTo(3.007f, 17.5f, 2f, 16.493f, 2f, 15.25f)
            verticalLineTo(9.254f)
            curveToRelative(0f, -1.795f, 1.455f, -3.25f, 3.25f, -3.25f)
            lineToRelative(0.749f, -0.001f)
            lineTo(6f, 5.25f)
            curveTo(6f, 4.007f, 7.007f, 3f, 8.25f, 3f)
            horizontalLineToRelative(7.502f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(0.753f)
            horizontalLineToRelative(0.75f)
            curveToRelative(1.795f, 0.002f, 3.25f, 1.456f, 3.252f, 3.25f)
            lineToRelative(0.003f, 5.997f)
            curveToRelative(0.002f, 1.242f, -1.005f, 2.25f, -2.248f, 2.25f)
            horizontalLineTo(18f)
            close()
            moveToRelative(-2.25f, -4f)
            horizontalLineToRelative(-7.5f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            close()
            moveToRelative(0.002f, -9f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 4.5f, 7.5f, 4.836f, 7.5f, 5.25f)
            lineTo(7.499f, 6.003f)
            horizontalLineToRelative(9.003f)
            verticalLineTo(5.25f)
            curveToRelative(0f, -0.414f, -0.335f, -0.75f, -0.75f, -0.75f)
            close()
        }
    }.build()
}
