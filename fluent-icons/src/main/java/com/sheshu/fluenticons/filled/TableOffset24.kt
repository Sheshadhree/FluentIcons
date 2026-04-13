package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableOffset24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableOffset24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(8.5f)
            horizontalLineToRelative(11f)
            verticalLineTo(3f)
            close()
            moveToRelative(1.5f, 5.5f)
            horizontalLineTo(21f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(15.5f)
            verticalLineToRelative(5.5f)
            close()
            moveTo(21f, 10f)
            horizontalLineTo(10f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(11f)
            verticalLineToRelative(-4f)
            close()
            moveTo(8.5f, 10f)
            horizontalLineTo(3f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(-4f)
            close()
            moveTo(3f, 17.75f)
            verticalLineTo(15.5f)
            horizontalLineToRelative(11f)
            verticalLineTo(21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            close()
            moveTo(15.5f, 21f)
            verticalLineToRelative(-5.5f)
            horizontalLineTo(21f)
            verticalLineToRelative(2.25f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(15.5f)
            close()
        }
    }.build()
}
