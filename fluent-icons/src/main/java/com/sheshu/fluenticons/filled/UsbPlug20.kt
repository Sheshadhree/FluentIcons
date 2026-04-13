package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.UsbPlug20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.UsbPlug20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 2.5f)
            curveTo(7f, 2.224f, 7.224f, 2f, 7.5f, 2f)
            horizontalLineToRelative(5f)
            curveTo(12.776f, 2f, 13f, 2.224f, 13f, 2.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(0.079f)
            curveTo(14.137f, 6f, 15f, 6.853f, 15f, 7.912f)
            verticalLineToRelative(5.176f)
            curveTo(15f, 14.148f, 14.137f, 15f, 13.079f, 15f)
            horizontalLineTo(12f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(11f, 17.776f, 11f, 17.5f)
            verticalLineTo(15f)
            horizontalLineTo(9f)
            verticalLineToRelative(2.5f)
            curveTo(9f, 17.776f, 8.776f, 18f, 8.5f, 18f)
            reflectiveCurveTo(8f, 17.776f, 8f, 17.5f)
            verticalLineTo(15f)
            horizontalLineTo(6.921f)
            curveTo(5.863f, 15f, 5f, 14.147f, 5f, 13.088f)
            verticalLineTo(7.912f)
            curveTo(5f, 6.852f, 5.863f, 6f, 6.921f, 6f)
            horizontalLineTo(7f)
            verticalLineTo(2.5f)
            close()
            moveTo(8f, 6f)
            horizontalLineToRelative(4f)
            verticalLineTo(3f)
            horizontalLineTo(8f)
            verticalLineToRelative(3f)
            close()
        }
    }.build()
}
