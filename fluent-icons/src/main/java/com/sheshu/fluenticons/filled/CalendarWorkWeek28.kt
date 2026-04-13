package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarWorkWeek28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarWorkWeek28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 13.5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(4f)
            horizontalLineTo(9f)
            close()
            moveToRelative(-6f, 8.25f)
            curveTo(3f, 23.545f, 4.455f, 25f, 6.25f, 25f)
            horizontalLineToRelative(15.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(25f, 4.455f, 23.545f, 3f, 21.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(15.5f)
            close()
            moveTo(8.25f, 8f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(8.25f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-5.5f)
            curveTo(7.5f, 8.336f, 7.836f, 8f, 8.25f, 8f)
            close()
        }
    }.build()
}
