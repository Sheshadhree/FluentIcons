package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarWorkWeek24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarWorkWeek24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 11f)
            verticalLineTo(8.5f)
            horizontalLineToRelative(7f)
            verticalLineTo(11f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(9.25f, 10f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(11.5f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(11.5f)
            close()
            moveToRelative(-10f, -14f)
            horizontalLineToRelative(8.5f)
            curveTo(16.664f, 7f, 17f, 7.336f, 17f, 7.75f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(7.336f, 12.5f, 7f, 12.164f, 7f, 11.75f)
            verticalLineToRelative(-4f)
            curveTo(7f, 7.336f, 7.336f, 7f, 7.75f, 7f)
            close()
        }
    }.build()
}
