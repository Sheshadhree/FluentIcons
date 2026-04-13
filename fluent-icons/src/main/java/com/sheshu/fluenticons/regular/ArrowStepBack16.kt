package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowStepBack16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowStepBack16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.854f, 2.147f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineTo(3.707f, 5f)
            horizontalLineToRelative(2.336f)
            curveToRelative(1.468f, 0f, 2.905f, 0f, 4.226f, 0.396f)
            curveToRelative(1.365f, 0.41f, 2.585f, 1.234f, 3.647f, 2.827f)
            curveToRelative(0.153f, 0.23f, 0.091f, 0.54f, -0.139f, 0.693f)
            curveToRelative(-0.23f, 0.153f, -0.54f, 0.091f, -0.693f, -0.139f)
            curveToRelative(-0.938f, -1.407f, -1.968f, -2.083f, -3.103f, -2.423f)
            curveTo(8.815f, 6.004f, 7.517f, 6f, 6f, 6f)
            horizontalLineTo(3.707f)
            lineToRelative(2.147f, 2.146f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(-0.196f, 0.196f, -0.512f, 0.196f, -0.708f, 0f)
            lineToRelative(-3f, -3f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.511f, 0f, -0.707f)
            lineToRelative(3f, -3f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            close()
            moveTo(8f, 14f)
            curveToRelative(1.104f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.896f, -2f, -2f, -2f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
            moveToRelative(0f, -1f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            close()
        }
    }.build()
}
