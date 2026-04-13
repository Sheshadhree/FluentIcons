package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.People12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.People12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.153f, 7.008f)
            curveTo(6.91f, 7.085f, 7.5f, 7.723f, 7.5f, 8.5f)
            curveToRelative(0f, 0.771f, -0.47f, 1.409f, -1.102f, 1.83f)
            curveTo(5.763f, 10.754f, 4.913f, 11f, 4f, 11f)
            reflectiveCurveToRelative(-1.763f, -0.246f, -2.398f, -0.67f)
            curveTo(0.969f, 9.91f, 0.5f, 9.271f, 0.5f, 8.5f)
            curveTo(0.5f, 7.672f, 1.172f, 7f, 2f, 7f)
            horizontalLineToRelative(4f)
            lineToRelative(0.153f, 0.008f)
            close()
            moveTo(10.003f, 7f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            curveToRelative(0f, 0.695f, -0.432f, 1.211f, -0.983f, 1.528f)
            curveTo(9.972f, 10.343f, 9.255f, 10.5f, 8.503f, 10.5f)
            curveTo(8.25f, 10.5f, 8f, 10.48f, 7.762f, 10.444f)
            curveTo(8.195f, 9.932f, 8.5f, 9.278f, 8.5f, 8.5f)
            curveToRelative(0f, -0.564f, -0.19f, -1.082f, -0.504f, -1.5f)
            horizontalLineToRelative(2.006f)
            close()
            moveTo(4.002f, 1.496f)
            curveToRelative(1.243f, 0f, 2.252f, 1.009f, 2.252f, 2.252f)
            curveTo(6.254f, 4.992f, 5.245f, 6f, 4.002f, 6f)
            curveTo(2.758f, 6f, 1.75f, 4.992f, 1.75f, 3.748f)
            curveToRelative(0f, -1.243f, 1.009f, -2.252f, 2.252f, -2.252f)
            close()
            moveTo(8.75f, 2.497f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            reflectiveCurveToRelative(-0.784f, 1.75f, -1.75f, 1.75f)
            reflectiveCurveTo(7f, 5.213f, 7f, 4.247f)
            reflectiveCurveToRelative(0.784f, -1.75f, 1.75f, -1.75f)
            close()
        }
    }.build()
}
