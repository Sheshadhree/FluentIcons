package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationArrowLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationArrowLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.95f, 13.955f)
            curveToRelative(2.733f, -2.735f, 2.733f, -7.169f, 0f, -9.904f)
            curveToRelative(-2.734f, -2.735f, -7.166f, -2.735f, -9.9f, 0f)
            curveToRelative(-2.733f, 2.735f, -2.733f, 7.17f, 0f, 9.904f)
            lineToRelative(1.521f, 1.499f)
            lineToRelative(2.043f, 1.985f)
            lineToRelative(0.133f, 0.118f)
            curveToRelative(0.775f, 0.628f, 1.91f, 0.588f, 2.64f, -0.118f)
            lineToRelative(2.435f, -2.37f)
            lineToRelative(1.128f, -1.114f)
            close()
            moveTo(9.854f, 6.354f)
            lineTo(8.207f, 8f)
            horizontalLineTo(13f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(13.276f, 9f, 13f, 9f)
            horizontalLineTo(8.207f)
            lineToRelative(1.646f, 1.646f)
            curveToRelative(0.196f, 0.196f, 0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.195f, 0.195f, -0.511f, 0.195f, -0.707f, 0f)
            lineToRelative(-2.5f, -2.5f)
            curveTo(6.553f, 8.76f, 6.5f, 8.633f, 6.5f, 8.5f)
            curveToRelative(0f, -0.133f, 0.053f, -0.26f, 0.146f, -0.354f)
            lineToRelative(2.5f, -2.5f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            curveToRelative(0.196f, 0.196f, 0.196f, 0.512f, 0f, 0.708f)
            close()
        }
    }.build()
}
