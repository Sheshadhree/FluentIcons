package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSimpleMultiple24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimpleMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.75f, 19f)
            horizontalLineTo(11.5f)
            verticalLineToRelative(-7.5f)
            horizontalLineTo(19f)
            verticalLineToRelative(4.25f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            close()
            moveTo(19f, 10f)
            horizontalLineToRelative(-7.5f)
            verticalLineTo(2f)
            horizontalLineToRelative(4.25f)
            curveTo(17.545f, 2f, 19f, 3.455f, 19f, 5.25f)
            verticalLineTo(10f)
            close()
            moveToRelative(-9f, 0f)
            verticalLineTo(2f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
            verticalLineTo(10f)
            horizontalLineToRelative(8f)
            close()
            moveToRelative(0f, 9f)
            verticalLineToRelative(-7.5f)
            horizontalLineTo(2f)
            verticalLineToRelative(4.25f)
            curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
            horizontalLineTo(10f)
            close()
            moveToRelative(-1.75f, 3f)
            curveToRelative(-1.351f, 0f, -2.51f, -0.826f, -3f, -2f)
            horizontalLineToRelative(10.502f)
            curveToRelative(2.347f, 0f, 4.25f, -1.903f, 4.25f, -4.25f)
            verticalLineTo(5.25f)
            curveTo(21.176f, 5.74f, 22f, 6.898f, 22f, 8.25f)
            verticalLineToRelative(8.25f)
            curveToRelative(0f, 3.038f, -2.463f, 5.5f, -5.5f, 5.5f)
            horizontalLineTo(8.25f)
            close()
        }
    }.build()
}
