package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Wrench24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Wrench24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF2BDABE),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(10.1283f, 3.24914f),
                end = Offset(13.694f, 22.7068f)
            )
        ) {
            moveTo(16.5f, 2f)
            curveTo(13.463f, 2f, 11f, 4.462f, 11f, 7.5f)
            curveToRelative(0f, 0.443f, 0.053f, 0.875f, 0.152f, 1.289f)
            lineTo(2.841f, 17.1f)
            curveToRelative(-1.121f, 1.122f, -1.121f, 2.94f, 0f, 4.06f)
            curveToRelative(1.121f, 1.122f, 2.94f, 1.122f, 4.06f, 0f)
            lineToRelative(8.313f, -8.311f)
            curveTo(15.627f, 12.948f, 16.058f, 13f, 16.5f, 13f)
            curveToRelative(3.038f, 0f, 5.5f, -2.462f, 5.5f, -5.5f)
            curveToRelative(0f, -0.609f, -0.099f, -1.196f, -0.282f, -1.745f)
            curveToRelative(-0.083f, -0.246f, -0.287f, -0.433f, -0.54f, -0.492f)
            curveToRelative(-0.253f, -0.06f, -0.518f, 0.016f, -0.702f, 0.2f)
            lineToRelative(-2.444f, 2.444f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.06f, 0f)
            lineToRelative(-0.879f, -0.878f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(2.445f, -2.445f)
            curveToRelative(0.183f, -0.183f, 0.259f, -0.45f, 0.2f, -0.702f)
            curveToRelative(-0.06f, -0.253f, -0.247f, -0.457f, -0.493f, -0.54f)
            curveTo(17.695f, 2.1f, 17.109f, 2f, 16.5f, 2f)
            close()
        }
    }.build()
}
