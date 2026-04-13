package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonNote16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonNote16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 10f)
            verticalLineToRelative(3.928f)
            curveTo(3.469f, 13.549f, 2f, 11.752f, 2f, 10f)
            verticalLineTo(9.5f)
            curveTo(2f, 8.672f, 2.672f, 8f, 3.5f, 8f)
            horizontalLineToRelative(3.264f)
            curveTo(6.289f, 8.53f, 6f, 9.232f, 6f, 10f)
            close()
            moveToRelative(1f, -8.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            reflectiveCurveTo(8.519f, 7f, 7f, 7f)
            reflectiveCurveTo(4.25f, 5.769f, 4.25f, 4.25f)
            reflectiveCurveTo(5.481f, 1.5f, 7f, 1.5f)
            close()
            moveTo(9f, 8f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(5f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(9f)
            close()
            moveToRelative(0.5f, 5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(13.776f, 14f, 13.5f, 14f)
            horizontalLineToRelative(-4f)
            curveTo(9.224f, 14f, 9f, 13.776f, 9f, 13.5f)
            reflectiveCurveTo(9.224f, 13f, 9.5f, 13f)
            close()
            moveTo(9f, 10.5f)
            curveTo(9f, 10.224f, 9.224f, 10f, 9.5f, 10f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(13.776f, 11f, 13.5f, 11f)
            horizontalLineToRelative(-4f)
            curveTo(9.224f, 11f, 9f, 10.776f, 9f, 10.5f)
            close()
        }
    }.build()
}
