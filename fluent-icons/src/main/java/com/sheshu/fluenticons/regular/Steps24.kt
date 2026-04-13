package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Steps24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Steps24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 3.375f)
            curveTo(12f, 2.615f, 12.616f, 2f, 13.375f, 2f)
            horizontalLineToRelative(3.75f)
            curveToRelative(0.76f, 0f, 1.375f, 0.616f, 1.375f, 1.375f)
            verticalLineTo(9f)
            horizontalLineTo(17f)
            verticalLineTo(3.5f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(3.625f)
            curveToRelative(0f, 0.76f, -0.616f, 1.375f, -1.375f, 1.375f)
            horizontalLineTo(8.5f)
            verticalLineToRelative(3.625f)
            curveToRelative(0f, 0.76f, -0.616f, 1.375f, -1.375f, 1.375f)
            horizontalLineTo(3.5f)
            verticalLineTo(17f)
            horizontalLineTo(9f)
            verticalLineToRelative(1.5f)
            horizontalLineTo(3.375f)
            curveTo(2.615f, 18.5f, 2f, 17.884f, 2f, 17.125f)
            verticalLineToRelative(-3.75f)
            curveTo(2f, 12.615f, 2.616f, 12f, 3.375f, 12f)
            horizontalLineTo(7f)
            verticalLineTo(8.375f)
            curveTo(7f, 7.615f, 7.616f, 7f, 8.375f, 7f)
            horizontalLineTo(12f)
            verticalLineTo(3.375f)
            close()
            moveTo(16.375f, 10f)
            curveTo(15.615f, 10f, 15f, 10.616f, 15f, 11.375f)
            verticalLineTo(15f)
            horizontalLineToRelative(-3.625f)
            curveTo(10.615f, 15f, 10f, 15.616f, 10f, 16.375f)
            verticalLineToRelative(3.75f)
            curveToRelative(0f, 0.76f, 0.616f, 1.375f, 1.375f, 1.375f)
            horizontalLineToRelative(6.875f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-6.875f)
            curveToRelative(0f, -0.76f, -0.616f, -1.375f, -1.375f, -1.375f)
            horizontalLineToRelative(-3.75f)
            close()
            moveToRelative(0.125f, 5.125f)
            verticalLineTo(11.5f)
            horizontalLineTo(20f)
            verticalLineToRelative(6.75f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(11.5f)
            verticalLineToRelative(-3.5f)
            horizontalLineToRelative(3.625f)
            curveToRelative(0.76f, 0f, 1.375f, -0.616f, 1.375f, -1.375f)
            close()
        }
    }.build()
}
