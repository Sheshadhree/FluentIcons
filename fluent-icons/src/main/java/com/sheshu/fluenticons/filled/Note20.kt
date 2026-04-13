package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Note20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Note20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 3f)
            curveToRelative(1.598f, 0f, 2.904f, 1.249f, 2.995f, 2.824f)
            lineTo(17f, 6f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            lineToRelative(-0.176f, 0.005f)
            curveToRelative(-1.517f, 0.088f, -2.731f, 1.302f, -2.819f, 2.819f)
            lineTo(10f, 13f)
            verticalLineToRelative(4f)
            horizontalLineTo(6f)
            curveToRelative(-1.598f, 0f, -2.904f, -1.249f, -2.995f, -2.824f)
            lineTo(3f, 14f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.598f, 1.249f, -2.904f, 2.824f, -2.995f)
            lineTo(6f, 3f)
            horizontalLineToRelative(8f)
            close()
            moveToRelative(2.9f, 8.001f)
            curveToRelative(-0.077f, 0.237f, -0.198f, 0.458f, -0.358f, 0.652f)
            lineToRelative(-0.128f, 0.14f)
            lineToRelative(-4.621f, 4.621f)
            curveToRelative(-0.224f, 0.224f, -0.496f, 0.39f, -0.792f, 0.487f)
            lineTo(11f, 13f)
            lineToRelative(0.005f, -0.15f)
            curveToRelative(0.073f, -0.982f, 0.856f, -1.768f, 1.838f, -1.844f)
            lineTo(13f, 11f)
            lineToRelative(3.9f, 0.001f)
            close()
        }
    }.build()
}
