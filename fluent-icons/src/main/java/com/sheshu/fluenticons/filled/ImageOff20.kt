package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(1.409f, 1.408f)
            curveTo(3.205f, 4.752f, 3f, 5.352f, 3f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.648f, 0.205f, 1.248f, 0.555f, 1.738f)
            lineToRelative(5.385f, -5.385f)
            curveToRelative(0.124f, -0.124f, 0.264f, -0.221f, 0.413f, -0.293f)
            lineToRelative(0.982f, 0.982f)
            curveToRelative(-0.197f, -0.177f, -0.5f, -0.17f, -0.688f, 0.018f)
            lineToRelative(-5.385f, 5.385f)
            curveTo(4.752f, 16.795f, 5.352f, 17f, 6f, 17f)
            horizontalLineToRelative(8f)
            curveToRelative(0.648f, 0f, 1.248f, -0.205f, 1.738f, -0.555f)
            lineToRelative(1.408f, 1.409f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            close()
            moveTo(17f, 14f)
            curveToRelative(0f, 0.269f, -0.035f, 0.53f, -0.102f, 0.777f)
            lineTo(5.223f, 3.102f)
            curveTo(5.47f, 3.035f, 5.73f, 3f, 6f, 3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(8f)
            close()
            moveToRelative(-2.5f, -7.25f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            reflectiveCurveTo(12f, 6.06f, 12f, 6.75f)
            reflectiveCurveTo(12.56f, 8f, 13.25f, 8f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            close()
        }
    }.build()
}
