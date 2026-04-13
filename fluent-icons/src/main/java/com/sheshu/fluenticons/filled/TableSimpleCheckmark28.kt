package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSimpleCheckmark28: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimpleCheckmark28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 3f)
            horizontalLineToRelative(6.5f)
            verticalLineToRelative(10.25f)
            horizontalLineTo(3f)
            verticalLineToRelative(-6.5f)
            curveTo(3f, 4.679f, 4.679f, 3f, 6.75f, 3f)
            close()
            moveTo(3f, 14.75f)
            horizontalLineToRelative(10.25f)
            verticalLineTo(25f)
            horizontalLineToRelative(-6.5f)
            curveTo(4.679f, 25f, 3f, 23.321f, 3f, 21.25f)
            verticalLineToRelative(-6.5f)
            close()
            moveToRelative(11.75f, 0f)
            verticalLineTo(25f)
            horizontalLineToRelative(6.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineToRelative(-6.5f)
            horizontalLineTo(14.75f)
            close()
            moveToRelative(0f, -11.75f)
            verticalLineToRelative(10.25f)
            horizontalLineTo(25f)
            verticalLineToRelative(-6.5f)
            curveTo(25f, 4.679f, 23.321f, 3f, 21.25f, 3f)
            horizontalLineToRelative(-6.5f)
            close()
            moveToRelative(8.028f, 15.78f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.06f, 0f)
            lineToRelative(-1.498f, -1.498f)
            curveToRelative(-0.293f, -0.292f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(0.968f, 0.967f)
            lineToRelative(2.47f, -2.47f)
            curveToRelative(0.292f, -0.292f, 0.767f, -0.292f, 1.06f, 0f)
            curveToRelative(0.293f, 0.294f, 0.293f, 0.768f, 0f, 1.061f)
            close()
        }
    }.build()
}
