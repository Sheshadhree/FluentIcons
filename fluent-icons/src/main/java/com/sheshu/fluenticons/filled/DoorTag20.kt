package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DoorTag20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DoorTag20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.293f, 6.293f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            curveTo(10.512f, 7.902f, 10.256f, 8f, 10f, 8f)
            horizontalLineTo(7f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(7.048f)
            curveToRelative(0.012f, -1.296f, -0.476f, -2.595f, -1.464f, -3.583f)
            curveToRelative(-1.953f, -1.953f, -5.119f, -1.953f, -7.071f, 0f)
            curveToRelative(-0.781f, 0.78f, -0.781f, 2.047f, 0f, 2.828f)
            curveToRelative(0.78f, 0.78f, 2.047f, 0.78f, 2.828f, 0f)
            close()
            moveTo(8f, 14f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(12.276f, 15f, 12f, 15f)
            horizontalLineTo(8f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveTo(7.724f, 14f, 8f, 14f)
            close()
        }
    }.build()
}
