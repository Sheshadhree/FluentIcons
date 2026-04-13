package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowForwardDownPerson24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowForwardDownPerson24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.296f, 5.705f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.023f, 0f, -1.414f)
            curveToRelative(0.392f, -0.39f, 1.025f, -0.39f, 1.415f, 0.001f)
            lineToRelative(4.997f, 5.004f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.023f, 0f, 1.413f)
            lineToRelative(-4.997f, 4.998f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.415f, 0f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineTo(19.59f, 11f)
            horizontalLineTo(13f)
            curveToRelative(-4.335f, 0f, -7.864f, -3.448f, -7.996f, -7.75f)
            lineTo(5f, 3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 3.238f, 2.566f, 5.878f, 5.775f, 5.996f)
            lineTo(13f, 9f)
            horizontalLineToRelative(6.586f)
            lineToRelative(-3.29f, -3.295f)
            close()
            moveTo(9f, 13.5f)
            curveTo(9f, 14.88f, 7.88f, 16f, 6.5f, 16f)
            reflectiveCurveTo(4f, 14.88f, 4f, 13.5f)
            reflectiveCurveTo(5.12f, 11f, 6.5f, 11f)
            reflectiveCurveTo(9f, 12.12f, 9f, 13.5f)
            close()
            moveToRelative(2f, 5.375f)
            curveTo(11f, 20.431f, 9.714f, 22f, 6.5f, 22f)
            reflectiveCurveTo(2f, 20.437f, 2f, 18.875f)
            verticalLineToRelative(-0.103f)
            curveTo(2f, 17.792f, 2.794f, 17f, 3.773f, 17f)
            horizontalLineToRelative(5.454f)
            curveTo(10.207f, 17f, 11f, 17.793f, 11f, 18.772f)
            verticalLineToRelative(0.103f)
            close()
        }
    }.build()
}
