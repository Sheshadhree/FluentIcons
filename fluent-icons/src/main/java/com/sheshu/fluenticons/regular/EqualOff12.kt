package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.EqualOff12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EqualOff12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.853f, 1.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.706f, 0f)
            curveToRelative(-0.196f, 0.195f, -0.196f, 0.511f, 0f, 0.706f)
            lineTo(3.292f, 4f)
            horizontalLineTo(2f)
            curveTo(1.724f, 4f, 1.5f, 4.224f, 1.5f, 4.5f)
            reflectiveCurveTo(1.724f, 5f, 2f, 5f)
            horizontalLineToRelative(2.293f)
            lineToRelative(2f, 2f)
            horizontalLineTo(2f)
            curveTo(1.724f, 7f, 1.5f, 7.224f, 1.5f, 7.5f)
            reflectiveCurveTo(1.724f, 8f, 2f, 8f)
            horizontalLineToRelative(5.293f)
            lineToRelative(2.853f, 2.854f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-9f, -9f)
            close()
            moveTo(9.121f, 7f)
            lineToRelative(0.988f, 0.988f)
            curveTo(10.333f, 7.938f, 10.5f, 7.738f, 10.5f, 7.5f)
            curveTo(10.5f, 7.224f, 10.276f, 7f, 10f, 7f)
            horizontalLineTo(9.121f)
            close()
            moveToRelative(-3f, -3f)
            lineToRelative(1f, 1f)
            horizontalLineTo(10f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.276f, 4f, 10f, 4f)
            horizontalLineTo(6.121f)
            close()
        }
    }.build()
}
