package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CheckboxIndeterminate24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CheckboxIndeterminate24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(11.5f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(5f, 6.25f)
            curveTo(5f, 5.56f, 5.56f, 5f, 6.25f, 5f)
            horizontalLineToRelative(11.5f)
            curveTo(18.44f, 5f, 19f, 5.56f, 19f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(6.25f)
            curveTo(5.56f, 19f, 5f, 18.44f, 5f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(7.5f, 6.5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(9f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-9f)
            close()
        }
    }.build()
}
