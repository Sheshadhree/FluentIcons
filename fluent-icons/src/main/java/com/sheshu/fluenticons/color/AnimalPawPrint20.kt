package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.AnimalPawPrint20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.AnimalPawPrint20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFFF921F),
                    1f to Color(0xFFEB4824)
                ),
                start = Offset(6.85365f, 9.19642f),
                end = Offset(10.7773f, 17.55f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4f, 14f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            curveToRelative(0f, 0.986f, -0.504f, 1.753f, -1.21f, 2.255f)
            curveTo(14.092f, 16.75f, 13.188f, 17f, 12.304f, 17f)
            horizontalLineToRelative(-4.61f)
            curveToRelative(-0.884f, 0f, -1.788f, -0.25f, -2.485f, -0.745f)
            curveTo(4.505f, 15.753f, 4f, 14.986f, 4f, 14f)
            close()
            moveToRelative(1.5f, -9.75f)
            curveTo(5.5f, 3.082f, 6.326f, 2f, 7.5f, 2f)
            reflectiveCurveToRelative(2f, 1.082f, 2f, 2.25f)
            reflectiveCurveToRelative(-0.826f, 2.25f, -2f, 2.25f)
            reflectiveCurveToRelative(-2f, -1.082f, -2f, -2.25f)
            close()
            moveTo(3f, 4.5f)
            curveToRelative(-1.174f, 0f, -2f, 1.082f, -2f, 2.25f)
            reflectiveCurveTo(1.826f, 9f, 3f, 9f)
            reflectiveCurveToRelative(2f, -1.082f, 2f, -2.25f)
            reflectiveCurveTo(4.174f, 4.5f, 3f, 4.5f)
            close()
            moveToRelative(12f, 2.25f)
            curveToRelative(0f, -1.168f, 0.826f, -2.25f, 2f, -2.25f)
            reflectiveCurveToRelative(2f, 1.082f, 2f, 2.25f)
            reflectiveCurveTo(18.174f, 9f, 17f, 9f)
            reflectiveCurveToRelative(-2f, -1.082f, -2f, -2.25f)
            close()
            moveToRelative(-4.5f, -2.5f)
            curveToRelative(0f, -1.168f, 0.826f, -2.25f, 2f, -2.25f)
            reflectiveCurveToRelative(2f, 1.082f, 2f, 2.25f)
            reflectiveCurveToRelative(-0.826f, 2.25f, -2f, 2.25f)
            reflectiveCurveToRelative(-2f, -1.082f, -2f, -2.25f)
            close()
        }
    }.build()
}
