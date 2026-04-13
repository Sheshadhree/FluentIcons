package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Steps24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Steps24",
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
            moveToRelative(3f, 8f)
            curveTo(15f, 10.615f, 15.616f, 10f, 16.375f, 10f)
            horizontalLineToRelative(3.75f)
            curveToRelative(0.76f, 0f, 1.375f, 0.616f, 1.375f, 1.375f)
            verticalLineToRelative(6.875f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-6.875f)
            curveToRelative(-0.76f, 0f, -1.375f, -0.616f, -1.375f, -1.375f)
            verticalLineToRelative(-3.75f)
            curveTo(10f, 15.615f, 10.616f, 15f, 11.375f, 15f)
            horizontalLineTo(15f)
            verticalLineToRelative(-3.625f)
            close()
        }
    }.build()
}
