package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.TextBulletListSquare28: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.TextBulletListSquare28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(3.78571f, 7.125f),
                end = Offset(18.9684f, 22.8992f)
            )
        ) {
            moveTo(3f, 6.75f)
            curveTo(3f, 4.679f, 4.679f, 3f, 6.75f, 3f)
            horizontalLineToRelative(14.5f)
            curveTo(23.321f, 3f, 25f, 4.679f, 25f, 6.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(6.75f)
            curveTo(4.679f, 25f, 3f, 23.321f, 3f, 21.25f)
            verticalLineTo(6.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(10.0962f, 8.96154f),
                end = Offset(18.7802f, 31.6849f)
            )
        ) {
            moveTo(12f, 9.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(7.5f)
            curveTo(20.664f, 8.5f, 21f, 8.836f, 21f, 9.25f)
            reflectiveCurveTo(20.664f, 10f, 20.25f, 10f)
            horizontalLineToRelative(-7.5f)
            curveTo(12.336f, 10f, 12f, 9.664f, 12f, 9.25f)
            close()
            moveToRelative(0.75f, 4.25f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(20.664f, 15f, 20.25f, 15f)
            horizontalLineToRelative(-7.5f)
            curveTo(12.336f, 15f, 12f, 14.664f, 12f, 14.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            close()
            moveTo(12f, 19.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(20.664f, 20f, 20.25f, 20f)
            horizontalLineToRelative(-7.5f)
            curveTo(12.336f, 20f, 12f, 19.664f, 12f, 19.25f)
            close()
            moveTo(8.75f, 10.5f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveTo(8.06f, 8f, 8.75f, 8f)
            reflectiveCurveTo(10f, 8.56f, 10f, 9.25f)
            reflectiveCurveTo(9.44f, 10.5f, 8.75f, 10.5f)
            close()
            moveTo(10f, 14.25f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveTo(7.5f, 14.94f, 7.5f, 14.25f)
            reflectiveCurveTo(8.06f, 13f, 8.75f, 13f)
            reflectiveCurveTo(10f, 13.56f, 10f, 14.25f)
            close()
            moveTo(8.75f, 20.5f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveTo(8.06f, 18f, 8.75f, 18f)
            reflectiveCurveTo(10f, 18.56f, 10f, 19.25f)
            reflectiveCurveTo(9.44f, 20.5f, 8.75f, 20.5f)
            close()
        }
    }.build()
}
