package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSimpleCheckmark24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimpleCheckmark24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.25f, 12.75f)
            verticalLineTo(21f)
            horizontalLineToRelative(-5f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(8.25f)
            close()
            moveToRelative(1.5f, 8.25f)
            verticalLineToRelative(-8.25f)
            horizontalLineTo(21f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-5f)
            close()
            moveToRelative(0f, -18f)
            verticalLineToRelative(8.25f)
            horizontalLineTo(21f)
            verticalLineToRelative(-5f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineToRelative(-5f)
            close()
            moveToRelative(-1.5f, 0f)
            verticalLineToRelative(8.25f)
            horizontalLineTo(3f)
            verticalLineToRelative(-5f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(5f)
            close()
            moveToRelative(7.533f, 13.28f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.768f, -0.293f, -1.06f, 0f)
            lineToRelative(-1.473f, 1.472f)
            lineToRelative(-0.47f, -0.47f)
            curveToRelative(-0.293f, -0.292f, -0.767f, -0.292f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.768f, 0f, 1.061f)
            lineToRelative(1f, 1f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(2.003f, -2.003f)
            close()
        }
    }.build()
}
