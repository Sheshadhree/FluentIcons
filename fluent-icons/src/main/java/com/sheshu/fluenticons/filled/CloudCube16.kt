package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudCube16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudCube16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveTo(5.958f, 2f, 4.273f, 3.53f, 4.03f, 5.507f)
            curveTo(2.338f, 5.62f, 1f, 7.03f, 1f, 8.75f)
            curveTo(1f, 10.545f, 2.455f, 12f, 4.25f, 12f)
            horizontalLineTo(6f)
            verticalLineTo(8.5f)
            curveToRelative(0f, -0.758f, 0.428f, -1.45f, 1.106f, -1.789f)
            lineToRelative(3f, -1.5f)
            curveToRelative(0.563f, -0.281f, 1.225f, -0.281f, 1.788f, 0f)
            lineToRelative(0.031f, 0.016f)
            curveTo(11.565f, 3.387f, 9.945f, 2f, 8f, 2f)
            close()
            moveToRelative(6.447f, 5.606f)
            lineToRelative(-3f, -1.5f)
            curveToRelative(-0.281f, -0.141f, -0.613f, -0.141f, -0.894f, 0f)
            lineToRelative(-3f, 1.5f)
            curveTo(7.214f, 7.775f, 7f, 8.12f, 7f, 8.5f)
            verticalLineToRelative(4.004f)
            curveToRelative(0f, 0.379f, 0.214f, 0.725f, 0.553f, 0.894f)
            lineToRelative(3f, 1.5f)
            curveToRelative(0.281f, 0.141f, 0.613f, 0.141f, 0.894f, 0f)
            lineToRelative(3f, -1.5f)
            curveTo(14.786f, 13.23f, 15f, 12.883f, 15f, 12.504f)
            verticalLineTo(8.5f)
            curveToRelative(0f, -0.379f, -0.214f, -0.725f, -0.553f, -0.894f)
            close()
            moveTo(8.04f, 8.732f)
            curveTo(8.15f, 8.478f, 8.443f, 8.36f, 8.697f, 8.469f)
            lineTo(11f, 9.456f)
            lineToRelative(2.303f, -0.987f)
            curveToRelative(0.254f, -0.109f, 0.548f, 0.009f, 0.657f, 0.263f)
            curveToRelative(0.108f, 0.254f, -0.01f, 0.547f, -0.263f, 0.656f)
            lineTo(11.5f, 10.33f)
            verticalLineTo(13f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-2.67f)
            lineTo(8.303f, 9.388f)
            curveTo(8.049f, 9.28f, 7.932f, 8.986f, 8.04f, 8.732f)
            close()
        }
    }.build()
}
