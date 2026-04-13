package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarCheckmarkCenter48: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarCheckmarkCenter48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(42f, 35.75f)
            curveToRelative(0f, 3.452f, -2.798f, 6.25f, -6.25f, 6.25f)
            horizontalLineToRelative(-23.5f)
            curveTo(8.798f, 42f, 6f, 39.202f, 6f, 35.75f)
            verticalLineTo(16.5f)
            horizontalLineToRelative(36f)
            verticalLineToRelative(19.25f)
            close()
            moveToRelative(-9.362f, -13.134f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            lineToRelative(-9.368f, 9.366f)
            lineToRelative(-4.114f, -4.113f)
            lineToRelative(-0.095f, -0.086f)
            curveToRelative(-0.491f, -0.4f, -1.215f, -0.372f, -1.673f, 0.086f)
            curveToRelative(-0.457f, 0.458f, -0.486f, 1.182f, -0.086f, 1.673f)
            lineToRelative(0.086f, 0.095f)
            lineToRelative(4.998f, 4.999f)
            curveToRelative(0.235f, 0.234f, 0.553f, 0.366f, 0.884f, 0.366f)
            curveToRelative(0.332f, 0f, 0.65f, -0.132f, 0.885f, -0.366f)
            lineToRelative(10.25f, -10.252f)
            curveToRelative(0.489f, -0.488f, 0.489f, -1.28f, 0f, -1.768f)
            close()
            moveTo(35.75f, 6f)
            curveTo(39.202f, 6f, 42f, 8.798f, 42f, 12.25f)
            verticalLineTo(14f)
            horizontalLineTo(6f)
            verticalLineToRelative(-1.75f)
            curveTo(6f, 8.798f, 8.798f, 6f, 12.25f, 6f)
            horizontalLineToRelative(23.5f)
            close()
        }
    }.build()
}
