package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CircleLine20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CircleLine20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.985f, 10.5f)
            horizontalLineTo(2.015f)
            curveTo(2.275f, 14.685f, 5.75f, 18f, 10f, 18f)
            reflectiveCurveToRelative(7.727f, -3.315f, 7.985f, -7.5f)
            close()
            moveToRelative(0f, -1f)
            horizontalLineTo(2.015f)
            curveTo(2.275f, 5.315f, 5.75f, 2f, 10f, 2f)
            reflectiveCurveToRelative(7.727f, 3.315f, 7.985f, 7.5f)
            close()
        }
    }.build()
}
