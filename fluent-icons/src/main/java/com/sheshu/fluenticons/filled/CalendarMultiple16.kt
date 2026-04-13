package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.05f, 4f)
            curveTo(2.282f, 2.859f, 3.29f, 2f, 4.5f, 2f)
            horizontalLineToRelative(5f)
            curveToRelative(1.21f, 0f, 2.218f, 0.859f, 2.45f, 2f)
            horizontalLineToRelative(-9.9f)
            close()
            moveTo(2f, 5f)
            verticalLineToRelative(4.5f)
            curveTo(2f, 10.88f, 3.12f, 12f, 4.5f, 12f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(5f)
            horizontalLineTo(2f)
            close()
            moveToRelative(4.5f, 9f)
            curveToRelative(-0.818f, 0f, -1.544f, -0.393f, -2f, -1f)
            horizontalLineToRelative(5.25f)
            curveTo(11.545f, 13f, 13f, 11.545f, 13f, 9.75f)
            verticalLineTo(4.5f)
            curveToRelative(0.607f, 0.456f, 1f, 1.182f, 1f, 2f)
            verticalLineToRelative(3.25f)
            curveTo(14f, 12.097f, 12.097f, 14f, 9.75f, 14f)
            horizontalLineTo(6.5f)
            close()
        }
    }.build()
}
