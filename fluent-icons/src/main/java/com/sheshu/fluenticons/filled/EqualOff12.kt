package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EqualOff12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EqualOff12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.853f, 1.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.706f, 0f)
            curveToRelative(-0.196f, 0.195f, -0.196f, 0.511f, 0f, 0.706f)
            lineTo(2.792f, 3.5f)
            horizontalLineTo(2.25f)
            curveTo(1.836f, 3.5f, 1.5f, 3.836f, 1.5f, 4.25f)
            reflectiveCurveTo(1.836f, 5f, 2.25f, 5f)
            horizontalLineToRelative(2.043f)
            lineToRelative(2f, 2f)
            horizontalLineTo(2.25f)
            curveTo(1.836f, 7f, 1.5f, 7.336f, 1.5f, 7.75f)
            reflectiveCurveTo(1.836f, 8.5f, 2.25f, 8.5f)
            horizontalLineToRelative(5.543f)
            lineToRelative(2.353f, 2.354f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-9f, -9f)
            close()
            moveTo(9.121f, 7f)
            lineToRelative(1.216f, 1.216f)
            curveTo(10.44f, 8.088f, 10.5f, 7.926f, 10.5f, 7.75f)
            curveTo(10.5f, 7.336f, 10.164f, 7f, 9.75f, 7f)
            horizontalLineTo(9.121f)
            close()
            moveToRelative(-3.5f, -3.5f)
            lineToRelative(1.5f, 1.5f)
            horizontalLineTo(9.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(10.164f, 3.5f, 9.75f, 3.5f)
            horizontalLineTo(5.621f)
            close()
        }
    }.build()
}
