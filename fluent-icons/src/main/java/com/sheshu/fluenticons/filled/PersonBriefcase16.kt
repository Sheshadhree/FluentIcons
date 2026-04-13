package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonBriefcase16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonBriefcase16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 7f)
            curveTo(13.328f, 7f, 14f, 7.672f, 14f, 8.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-6f)
            curveTo(7.672f, 16f, 7f, 15.328f, 7f, 14.5f)
            verticalLineToRelative(-4f)
            curveTo(7f, 9.672f, 7.672f, 9f, 8.5f, 9f)
            horizontalLineTo(9f)
            verticalLineTo(8.5f)
            curveTo(9f, 7.672f, 9.672f, 7f, 10.5f, 7f)
            horizontalLineToRelative(2f)
            close()
            moveToRelative(-2f, 1f)
            curveTo(10.224f, 8f, 10f, 8.224f, 10f, 8.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(3f)
            verticalLineTo(8.5f)
            curveTo(13f, 8.224f, 12.776f, 8f, 12.5f, 8f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(8.042f, 8.042f)
            curveTo(6.88f, 8.257f, 6f, 9.276f, 6f, 10.5f)
            verticalLineToRelative(3.426f)
            curveTo(3.469f, 13.547f, 2f, 11.752f, 2f, 10f)
            verticalLineTo(9.5f)
            curveTo(2f, 8.672f, 2.672f, 8f, 3.5f, 8f)
            horizontalLineToRelative(4.552f)
            lineToRelative(-0.01f, 0.042f)
            close()
            moveTo(7f, 1.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            reflectiveCurveTo(8.519f, 7f, 7f, 7f)
            reflectiveCurveTo(4.25f, 5.769f, 4.25f, 4.25f)
            reflectiveCurveTo(5.481f, 1.5f, 7f, 1.5f)
            close()
        }
    }.build()
}
