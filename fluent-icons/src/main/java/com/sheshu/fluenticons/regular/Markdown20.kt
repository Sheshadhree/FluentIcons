package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Markdown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Markdown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 4.5f)
            curveTo(16f, 4.224f, 15.776f, 4f, 15.5f, 4f)
            reflectiveCurveTo(15f, 4.224f, 15f, 4.5f)
            verticalLineToRelative(8.793f)
            lineToRelative(-1.146f, -1.147f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(2f, 2f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(2f, -2f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(16f, 13.293f)
            verticalLineTo(4.5f)
            close()
            moveTo(2.32f, 4.033f)
            curveTo(2.515f, 3.96f, 2.734f, 4.012f, 2.873f, 4.165f)
            lineTo(7f, 8.753f)
            lineToRelative(4.128f, -4.588f)
            curveToRelative(0.139f, -0.153f, 0.358f, -0.206f, 0.551f, -0.132f)
            curveTo(11.872f, 4.107f, 12f, 4.293f, 12f, 4.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(11f, 14.776f, 11f, 14.5f)
            verticalLineTo(5.803f)
            lineTo(7.372f, 9.835f)
            curveTo(7.277f, 9.94f, 7.142f, 10f, 7f, 10f)
            reflectiveCurveTo(6.723f, 9.94f, 6.628f, 9.835f)
            lineTo(3f, 5.803f)
            verticalLineTo(14.5f)
            curveTo(3f, 14.776f, 2.776f, 15f, 2.5f, 15f)
            reflectiveCurveTo(2f, 14.776f, 2f, 14.5f)
            verticalLineToRelative(-10f)
            curveToRelative(0f, -0.207f, 0.128f, -0.393f, 0.32f, -0.467f)
            close()
        }
    }.build()
}
