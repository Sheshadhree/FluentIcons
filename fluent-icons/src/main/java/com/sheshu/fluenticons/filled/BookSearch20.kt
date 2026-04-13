package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookSearch20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookSearch20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(15.776f, 17f, 15.5f, 17f)
            horizontalLineTo(6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            close()
            moveToRelative(5.586f, 7.879f)
            lineToRelative(1.268f, 1.267f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-1.267f, -1.268f)
            curveTo(10.483f, 10.848f, 10.009f, 11f, 9.5f, 11f)
            curveTo(8.12f, 11f, 7f, 9.88f, 7f, 8.5f)
            reflectiveCurveTo(8.12f, 6f, 9.5f, 6f)
            reflectiveCurveTo(12f, 7.12f, 12f, 8.5f)
            curveToRelative(0f, 0.51f, -0.152f, 0.983f, -0.414f, 1.379f)
            close()
            moveTo(8f, 8.5f)
            curveTo(8f, 7.672f, 8.672f, 7f, 9.5f, 7f)
            reflectiveCurveTo(11f, 7.672f, 11f, 8.5f)
            reflectiveCurveTo(10.328f, 10f, 9.5f, 10f)
            reflectiveCurveTo(8f, 9.328f, 8f, 8.5f)
            close()
        }
    }.build()
}
