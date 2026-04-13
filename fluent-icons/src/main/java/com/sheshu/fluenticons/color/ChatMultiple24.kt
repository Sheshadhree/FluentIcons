package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ChatMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ChatMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.63f to Color(0xFF3D35B1),
                    0.85f to Color(0xFF6553C9),
                    1f to Color(0xFF7660D3)
                ),
                center = Offset(11.0266f, 10.0047f),
                radius = 10.5735f
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(22f, 13.5f)
            curveTo(22f, 9.358f, 18.642f, 6f, 14.5f, 6f)
            curveTo(10.358f, 6f, 7f, 9.358f, 7f, 13.5f)
            curveToRelative(0f, 4.142f, 3.358f, 7.5f, 7.5f, 7.5f)
            curveToRelative(1.1f, 0f, 2.146f, -0.237f, 3.089f, -0.664f)
            curveToRelative(1.258f, 0.29f, 2.613f, 0.54f, 3.236f, 0.652f)
            curveToRelative(0.688f, 0.122f, 1.287f, -0.482f, 1.153f, -1.17f)
            curveToRelative(-0.118f, -0.61f, -0.38f, -1.918f, -0.681f, -3.143f)
            curveTo(21.748f, 15.71f, 22f, 14.633f, 22f, 13.5f)
            close()
            moveTo(14.517f, 18f)
            horizontalLineToRelative(-0.034f)
            horizontalLineToRelative(0.034f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(2f, 3f),
                end = Offset(17.0034f, 18f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(2f, 10.5f)
            curveTo(2f, 6.358f, 5.358f, 3f, 9.5f, 3f)
            curveToRelative(4.142f, 0f, 7.5f, 3.358f, 7.5f, 7.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            curveToRelative(-1.1f, 0f, -2.146f, -0.237f, -3.089f, -0.664f)
            curveToRelative(-1.258f, 0.29f, -2.613f, 0.54f, -3.236f, 0.652f)
            curveToRelative(-0.688f, 0.122f, -1.287f, -0.482f, -1.153f, -1.17f)
            curveToRelative(0.118f, -0.61f, 0.38f, -1.918f, 0.681f, -3.143f)
            curveTo(2.252f, 12.71f, 2f, 11.633f, 2f, 10.5f)
            close()
            moveTo(9.483f, 15f)
            horizontalLineToRelative(0.034f)
            horizontalLineToRelative(-0.034f)
            close()
        }
    }.build()
}
