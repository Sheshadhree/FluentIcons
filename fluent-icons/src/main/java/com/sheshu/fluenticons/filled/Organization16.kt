package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Organization16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Organization16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3.5f)
            curveTo(5.5f, 2.12f, 6.62f, 1f, 8f, 1f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            curveToRelative(0f, 1.21f, -0.86f, 2.219f, -2f, 2.45f)
            verticalLineTo(7f)
            horizontalLineToRelative(2.134f)
            curveTo(11.388f, 7f, 12f, 7.612f, 12f, 8.367f)
            verticalLineToRelative(1.683f)
            curveToRelative(1.141f, 0.232f, 2f, 1.24f, 2f, 2.45f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveTo(9f, 13.88f, 9f, 12.5f)
            curveToRelative(0f, -1.21f, 0.859f, -2.219f, 2f, -2.45f)
            verticalLineTo(8.366f)
            curveTo(11f, 8.165f, 10.836f, 8f, 10.634f, 8f)
            horizontalLineTo(5.367f)
            curveTo(5.164f, 8f, 5f, 8.164f, 5f, 8.367f)
            verticalLineToRelative(1.683f)
            curveToRelative(1.141f, 0.232f, 2f, 1.24f, 2f, 2.45f)
            curveTo(7f, 13.88f, 5.88f, 15f, 4.5f, 15f)
            reflectiveCurveTo(2f, 13.88f, 2f, 12.5f)
            curveToRelative(0f, -1.21f, 0.859f, -2.219f, 2f, -2.45f)
            verticalLineTo(8.366f)
            curveTo(4f, 7.613f, 4.612f, 7f, 5.367f, 7f)
            horizontalLineTo(7.5f)
            verticalLineTo(5.95f)
            curveToRelative(-1.141f, -0.232f, -2f, -1.24f, -2f, -2.45f)
            close()
        }
    }.build()
}
