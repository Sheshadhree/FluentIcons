package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSimpleExclude24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimpleExclude24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 2f)
            horizontalLineTo(9.5f)
            verticalLineToRelative(7.5f)
            horizontalLineTo(2f)
            verticalLineTo(5.25f)
            curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
            close()
            moveTo(2f, 11f)
            verticalLineToRelative(4.25f)
            curveToRelative(0f, 1.795f, 1.455f, 3.25f, 3.25f, 3.25f)
            horizontalLineTo(9.5f)
            verticalLineTo(11f)
            horizontalLineTo(2f)
            close()
            moveToRelative(16.5f, -1.5f)
            verticalLineTo(5.25f)
            curveTo(18.5f, 3.455f, 17.045f, 2f, 15.25f, 2f)
            horizontalLineTo(11f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(7.5f)
            close()
            moveToRelative(-6f, 5.25f)
            curveToRelative(0f, -1.243f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(5f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineToRelative(-5f)
            close()
        }
    }.build()
}
