package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.TextBulletListSquare16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.TextBulletListSquare16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(2.42857f, 4.25f),
                end = Offset(10.71f, 12.8541f)
            )
        ) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(5.53846f, 4.82692f),
                end = Offset(10.7972f, 18.4173f)
            )
        ) {
            moveTo(5.5f, 5f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(4f, 4.586f, 4f, 5f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(5.5f, 5.414f, 5.5f, 5f)
            close()
            moveToRelative(0f, 3f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(4f, 7.586f, 4f, 8f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(5.5f, 8.414f, 5.5f, 8f)
            close()
            moveToRelative(-0.75f, 3.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(4f, 10.586f, 4f, 11f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            close()
            moveTo(6.5f, 5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(4.5f)
            curveTo(11.776f, 5.5f, 12f, 5.276f, 12f, 5f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(7f)
            curveTo(6.724f, 4.5f, 6.5f, 4.724f, 6.5f, 5f)
            close()
            moveTo(7f, 7.5f)
            curveTo(6.724f, 7.5f, 6.5f, 7.724f, 6.5f, 8f)
            reflectiveCurveTo(6.724f, 8.5f, 7f, 8.5f)
            horizontalLineToRelative(4.5f)
            curveTo(11.776f, 8.5f, 12f, 8.276f, 12f, 8f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(7f)
            close()
            moveTo(6.5f, 11f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(7f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            close()
        }
    }.build()
}
