package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationAdd16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationAdd16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.156f, 14.544f)
            curveTo(10.899f, 13.01f, 14f, 9.876f, 14f, 7f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            reflectiveCurveTo(2f, 3.686f, 2f, 7f)
            curveToRelative(0f, 2.876f, 3.1f, 6.01f, 4.844f, 7.544f)
            curveToRelative(0.667f, 0.588f, 1.644f, 0.588f, 2.312f, 0f)
            close()
            moveTo(8f, 4f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(6f)
            horizontalLineTo(10f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(10.276f, 7f, 10f, 7f)
            horizontalLineTo(8.5f)
            verticalLineToRelative(1.5f)
            curveTo(8.5f, 8.776f, 8.276f, 9f, 8f, 9f)
            reflectiveCurveTo(7.5f, 8.776f, 7.5f, 8.5f)
            verticalLineTo(7f)
            horizontalLineTo(6f)
            curveTo(5.724f, 7f, 5.5f, 6.776f, 5.5f, 6.5f)
            reflectiveCurveTo(5.724f, 6f, 6f, 6f)
            horizontalLineToRelative(1.5f)
            verticalLineTo(4.5f)
            curveTo(7.5f, 4.224f, 7.724f, 4f, 8f, 4f)
            close()
        }
    }.build()
}
