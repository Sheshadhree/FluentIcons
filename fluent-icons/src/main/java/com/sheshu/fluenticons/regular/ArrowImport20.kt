package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowImport20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowImport20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 4f)
            curveTo(17.776f, 4f, 18f, 4.224f, 18f, 4.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(17f, 15.776f, 17f, 15.5f)
            verticalLineToRelative(-11f)
            curveTo(17f, 4.224f, 17.224f, 4f, 17.5f, 4f)
            close()
            moveTo(2f, 10f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(10.793f)
            lineToRelative(-3.147f, -3.146f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(4f, 4f)
            curveToRelative(0.048f, 0.048f, 0.084f, 0.104f, 0.108f, 0.163f)
            curveTo(14.986f, 9.867f, 15f, 9.93f, 15f, 9.997f)
            verticalLineToRelative(0.006f)
            curveToRelative(0f, 0.127f, -0.05f, 0.254f, -0.146f, 0.35f)
            lineToRelative(-4f, 4f)
            curveToRelative(-0.196f, 0.196f, -0.512f, 0.196f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.511f, 0f, -0.707f)
            lineToRelative(3.147f, -3.146f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 10.5f, 2f, 10.276f, 2f, 10f)
            close()
        }
    }.build()
}
