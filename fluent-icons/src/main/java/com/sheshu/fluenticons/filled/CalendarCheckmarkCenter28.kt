package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarCheckmarkCenter28: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarCheckmarkCenter28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25f, 21.75f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 25f, 3f, 23.545f, 3f, 21.75f)
            verticalLineTo(9.5f)
            horizontalLineToRelative(22f)
            verticalLineToRelative(12.25f)
            close()
            moveToRelative(-5.97f, -8.53f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-5.47f, 5.47f)
            lineToRelative(-2.47f, -2.47f)
            lineToRelative(-0.056f, -0.052f)
            curveToRelative(-0.295f, -0.24f, -0.73f, -0.223f, -1.004f, 0.052f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(3f, 3f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(6f, -6f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            close()
            moveTo(21.75f, 3f)
            curveTo(23.545f, 3f, 25f, 4.455f, 25f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(15.5f)
            close()
        }
    }.build()
}
