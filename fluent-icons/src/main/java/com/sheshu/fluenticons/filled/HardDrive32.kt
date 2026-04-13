package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HardDrive32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HardDrive32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.89f, 5f)
            curveTo(8.66f, 5f, 7.535f, 5.696f, 6.985f, 6.797f)
            lineToRelative(-3.817f, 7.632f)
            curveTo(3.806f, 14.153f, 4.51f, 14f, 5.25f, 14f)
            horizontalLineToRelative(21.5f)
            curveToRelative(0.74f, 0f, 1.444f, 0.153f, 2.083f, 0.43f)
            lineToRelative(-3.817f, -7.633f)
            curveTo(24.466f, 5.696f, 23.34f, 5f, 22.11f, 5f)
            horizontalLineTo(9.891f)
            close()
            moveTo(2f, 19.25f)
            curveToRelative(0f, -0.084f, 0.003f, -0.168f, 0.01f, -0.25f)
            curveToRelative(0.127f, -1.678f, 1.53f, -3f, 3.24f, -3f)
            horizontalLineToRelative(21.5f)
            curveToRelative(1.71f, 0f, 3.113f, 1.322f, 3.24f, 3f)
            curveToRelative(0.007f, 0.082f, 0.01f, 0.166f, 0.01f, 0.25f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 26f, 2f, 24.545f, 2f, 22.75f)
            verticalLineToRelative(-3.5f)
            close()
            moveToRelative(23.5f, 3f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            close()
        }
    }.build()
}
