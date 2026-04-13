package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlideLayout24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideLayout24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 8.75f)
            curveToRelative(0f, -0.138f, 0.112f, -0.25f, 0.25f, -0.25f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.138f, 0f, 0.25f, 0.112f, 0.25f, 0.25f)
            verticalLineToRelative(1.75f)
            horizontalLineToRelative(-11f)
            verticalLineTo(8.75f)
            close()
            moveToRelative(0f, 3.25f)
            verticalLineToRelative(3.25f)
            curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
            horizontalLineTo(9f)
            verticalLineTo(12f)
            horizontalLineTo(6.5f)
            close()
            moveToRelative(10.75f, 3.5f)
            horizontalLineTo(10.5f)
            verticalLineTo(12f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(3.25f)
            curveToRelative(0f, 0.138f, -0.112f, 0.25f, -0.25f, 0.25f)
            close()
            moveTo(2f, 6.75f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            horizontalLineToRelative(14.5f)
            curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
            verticalLineTo(6.75f)
            close()
            moveTo(6.75f, 7f)
            curveTo(5.784f, 7f, 5f, 7.784f, 5f, 8.75f)
            verticalLineToRelative(6.5f)
            curveTo(5f, 16.216f, 5.784f, 17f, 6.75f, 17f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-6.5f)
            curveTo(19f, 7.784f, 18.216f, 7f, 17.25f, 7f)
            horizontalLineTo(6.75f)
            close()
        }
    }.build()
}
