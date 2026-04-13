package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CommentMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 5f)
            curveTo(5.168f, 5f, 5.087f, 5.002f, 5.006f, 5.007f)
            curveTo(5.583f, 4.1f, 6.596f, 3.5f, 7.75f, 3.5f)
            horizontalLineToRelative(8f)
            curveToRelative(3.176f, 0f, 5.75f, 2.574f, 5.75f, 5.75f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.153f, -0.601f, 2.167f, -1.507f, 2.743f)
            curveTo(19.998f, 15.913f, 20f, 15.832f, 20f, 15.75f)
            verticalLineToRelative(-6.5f)
            curveTo(20f, 6.903f, 18.097f, 5f, 15.75f, 5f)
            horizontalLineTo(5.25f)
            close()
            moveTo(2f, 9.25f)
            curveTo(2f, 7.455f, 3.455f, 6f, 5.25f, 6f)
            horizontalLineToRelative(10.5f)
            curveTo(17.545f, 6f, 19f, 7.455f, 19f, 9.25f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-5.002f)
            lineTo(6.99f, 21.76f)
            curveTo(6.164f, 22.366f, 5f, 21.775f, 5f, 20.752f)
            verticalLineToRelative(-1.761f)
            curveToRelative(-1.678f, -0.128f, -3f, -1.53f, -3f, -3.241f)
            verticalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
