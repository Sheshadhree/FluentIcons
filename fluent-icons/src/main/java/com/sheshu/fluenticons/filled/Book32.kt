package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Book32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Book32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 26f)
            verticalLineTo(6f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(14f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            verticalLineToRelative(18.25f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(7f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(17f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(9f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            close()
            moveToRelative(5.75f, -20f)
            curveTo(9.784f, 6f, 9f, 6.784f, 9f, 7.75f)
            verticalLineToRelative(1.5f)
            curveTo(9f, 10.216f, 9.784f, 11f, 10.75f, 11f)
            horizontalLineToRelative(10.5f)
            curveTo(22.216f, 11f, 23f, 10.216f, 23f, 9.25f)
            verticalLineToRelative(-1.5f)
            curveTo(23f, 6.784f, 22.216f, 6f, 21.25f, 6f)
            horizontalLineToRelative(-10.5f)
            close()
        }
    }.build()
}
