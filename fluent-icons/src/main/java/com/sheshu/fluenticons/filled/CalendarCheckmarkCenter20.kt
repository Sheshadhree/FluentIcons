package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarCheckmarkCenter20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarCheckmarkCenter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 14.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(14f)
            verticalLineToRelative(7.5f)
            close()
            moveToRelative(-3.646f, -5.354f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineTo(9f, 12.793f)
            lineToRelative(-1.646f, -1.646f)
            lineToRelative(-0.079f, -0.065f)
            curveToRelative(-0.194f, -0.128f, -0.458f, -0.106f, -0.629f, 0.064f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.707f)
            lineToRelative(2f, 2f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.707f, 0f)
            lineToRelative(4f, -4f)
            curveToRelative(0.196f, -0.195f, 0.196f, -0.511f, 0f, -0.707f)
            close()
            moveTo(14.5f, 3f)
            curveTo(15.88f, 3f, 17f, 4.12f, 17f, 5.5f)
            verticalLineTo(6f)
            horizontalLineTo(3f)
            verticalLineTo(5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(9f)
            close()
        }
    }.build()
}
