package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextWrap16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextWrap16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 3.5f)
            curveTo(2f, 3.224f, 2.224f, 3f, 2.5f, 3f)
            horizontalLineToRelative(11f)
            curveTo(13.776f, 3f, 14f, 3.224f, 14f, 3.5f)
            reflectiveCurveTo(13.776f, 4f, 13.5f, 4f)
            horizontalLineToRelative(-11f)
            curveTo(2.224f, 4f, 2f, 3.776f, 2f, 3.5f)
            close()
            moveToRelative(0f, 4f)
            curveTo(2f, 7.224f, 2.224f, 7f, 2.5f, 7f)
            horizontalLineToRelative(10f)
            curveTo(13.88f, 7f, 15f, 8.12f, 15f, 9.5f)
            reflectiveCurveTo(13.88f, 12f, 12.5f, 12f)
            horizontalLineTo(9.707f)
            lineToRelative(0.647f, 0.646f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineToRelative(-1.5f, -1.5f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            lineToRelative(1.5f, -1.5f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineTo(9.707f, 11f)
            horizontalLineTo(12.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(13.328f, 8f, 12.5f, 8f)
            horizontalLineToRelative(-10f)
            curveTo(2.224f, 8f, 2f, 7.776f, 2f, 7.5f)
            close()
            moveTo(6f, 11f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(6.276f, 12f, 6f, 12f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 12f, 2f, 11.776f, 2f, 11.5f)
            reflectiveCurveTo(2.224f, 11f, 2.5f, 11f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}
