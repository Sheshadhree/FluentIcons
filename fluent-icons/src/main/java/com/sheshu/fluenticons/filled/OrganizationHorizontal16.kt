package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.OrganizationHorizontal16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.OrganizationHorizontal16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 10.5f)
            curveTo(2.12f, 10.5f, 1f, 9.38f, 1f, 8f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            curveToRelative(1.21f, 0f, 2.219f, 0.86f, 2.45f, 2f)
            horizontalLineTo(7f)
            verticalLineTo(5.367f)
            curveTo(7f, 4.612f, 7.612f, 4f, 8.367f, 4f)
            horizontalLineToRelative(1.683f)
            curveToRelative(0.232f, -1.141f, 1.24f, -2f, 2.45f, -2f)
            curveTo(13.88f, 2f, 15f, 3.12f, 15f, 4.5f)
            reflectiveCurveTo(13.88f, 7f, 12.5f, 7f)
            curveToRelative(-1.21f, 0f, -2.219f, -0.859f, -2.45f, -2f)
            horizontalLineTo(8.366f)
            curveTo(8.165f, 5f, 8f, 5.164f, 8f, 5.366f)
            verticalLineToRelative(5.267f)
            curveTo(8f, 10.836f, 8.164f, 11f, 8.367f, 11f)
            horizontalLineToRelative(1.683f)
            curveToRelative(0.232f, -1.141f, 1.24f, -2f, 2.45f, -2f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveTo(13.88f, 14f, 12.5f, 14f)
            curveToRelative(-1.21f, 0f, -2.219f, -0.859f, -2.45f, -2f)
            horizontalLineTo(8.366f)
            curveTo(7.613f, 12f, 7f, 11.388f, 7f, 10.633f)
            verticalLineTo(8.501f)
            horizontalLineTo(5.95f)
            curveTo(5.718f, 9.64f, 4.71f, 10.5f, 3.5f, 10.5f)
            close()
        }
    }.build()
}
