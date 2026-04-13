package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PortHdmi20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PortHdmi20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.854f, 7.44f)
            curveTo(5.134f, 7.157f, 5.516f, 7f, 5.914f, 7f)
            horizontalLineToRelative(8.172f)
            curveToRelative(0.398f, 0f, 0.78f, 0.158f, 1.06f, 0.44f)
            lineToRelative(2.415f, 2.413f)
            curveTo(17.842f, 10.136f, 18f, 10.517f, 18f, 10.915f)
            verticalLineTo(11.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-13f)
            curveTo(2.672f, 13f, 2f, 12.328f, 2f, 11.5f)
            verticalLineToRelative(-0.586f)
            curveToRelative(0f, -0.398f, 0.158f, -0.78f, 0.44f, -1.06f)
            lineToRelative(2.414f, -2.415f)
            close()
            moveTo(6.5f, 9.5f)
            curveTo(6.224f, 9.5f, 6f, 9.724f, 6f, 10f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
