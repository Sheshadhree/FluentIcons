package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.AnimalPawPrint32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.AnimalPawPrint32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFFF921F),
                    1f to Color(0xFFEB4824)
                ),
                start = Offset(11.2805f, 14.994f),
                end = Offset(18.2509f, 28.3504f)
            )
        ) {
            moveTo(16f, 13f)
            curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
            curveToRelative(0f, 0.227f, 0.008f, 0.452f, 0.025f, 0.675f)
            curveToRelative(0.142f, 1.914f, 1.265f, 3.276f, 2.703f, 4.122f)
            curveTo(11.143f, 27.63f, 12.905f, 28f, 14.555f, 28f)
            horizontalLineToRelative(2.89f)
            curveToRelative(1.65f, 0f, 3.412f, -0.37f, 4.827f, -1.203f)
            curveToRelative(1.438f, -0.846f, 2.56f, -2.208f, 2.703f, -4.122f)
            curveTo(24.992f, 22.452f, 25f, 22.227f, 25f, 22f)
            curveToRelative(0f, -4.97f, -4.03f, -9f, -9f, -9f)
            close()
            moveTo(8.5f, 6.75f)
            curveTo(8.5f, 4.876f, 9.777f, 3f, 11.75f, 3f)
            reflectiveCurveTo(15f, 4.876f, 15f, 6.75f)
            reflectiveCurveToRelative(-1.277f, 3.75f, -3.25f, 3.75f)
            reflectiveCurveTo(8.5f, 8.624f, 8.5f, 6.75f)
            close()
            moveToRelative(8.5f, 0f)
            curveTo(17f, 4.876f, 18.277f, 3f, 20.25f, 3f)
            reflectiveCurveToRelative(3.25f, 1.876f, 3.25f, 3.75f)
            reflectiveCurveToRelative(-1.277f, 3.75f, -3.25f, 3.75f)
            reflectiveCurveTo(17f, 8.624f, 17f, 6.75f)
            close()
            moveToRelative(7f, 4.5f)
            curveToRelative(0f, -1.874f, 1.277f, -3.75f, 3.25f, -3.75f)
            reflectiveCurveToRelative(3.25f, 1.876f, 3.25f, 3.75f)
            reflectiveCurveTo(29.223f, 15f, 27.25f, 15f)
            reflectiveCurveTo(24f, 13.124f, 24f, 11.25f)
            close()
            moveToRelative(-22.5f, 0f)
            curveToRelative(0f, -1.874f, 1.277f, -3.75f, 3.25f, -3.75f)
            reflectiveCurveTo(8f, 9.376f, 8f, 11.25f)
            reflectiveCurveTo(6.723f, 15f, 4.75f, 15f)
            reflectiveCurveTo(1.5f, 13.124f, 1.5f, 11.25f)
            close()
        }
    }.build()
}
