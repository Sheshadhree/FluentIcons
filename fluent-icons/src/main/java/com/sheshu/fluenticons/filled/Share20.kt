package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Share20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Share20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 3f)
            curveTo(9.776f, 3f, 10f, 3.224f, 10f, 3.5f)
            reflectiveCurveTo(9.776f, 4f, 9.5f, 4f)
            horizontalLineTo(6f)
            curveTo(4.896f, 4f, 4f, 4.895f, 4f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.104f, 0.896f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.104f, 0f, 2f, -0.896f, 2f, -2f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(14f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(3.5f)
            close()
            moveToRelative(3.797f, -0.957f)
            curveToRelative(0.18f, -0.08f, 0.391f, -0.047f, 0.538f, 0.085f)
            lineToRelative(5f, 4.5f)
            curveTo(18.94f, 6.723f, 19f, 6.858f, 19f, 7f)
            curveToRelative(0f, 0.141f, -0.06f, 0.277f, -0.165f, 0.372f)
            lineToRelative(-5f, 4.5f)
            curveToRelative(-0.147f, 0.132f, -0.358f, 0.165f, -0.538f, 0.085f)
            curveTo(13.117f, 11.877f, 13f, 11.697f, 13f, 11.5f)
            verticalLineTo(9.34f)
            curveToRelative(-1.4f, 0.128f, -2.665f, 0.78f, -3.7f, 1.608f)
            curveToRelative(-1.014f, 0.813f, -1.775f, 1.768f, -2.195f, 2.484f)
            lineToRelative(-0.158f, 0.291f)
            curveToRelative(-0.103f, 0.208f, -0.337f, 0.316f, -0.562f, 0.263f)
            curveTo(6.159f, 13.933f, 6f, 13.731f, 6f, 13.5f)
            curveToRelative(0f, -2.049f, 0.382f, -4.284f, 1.519f, -6.024f)
            curveTo(8.609f, 5.808f, 10.367f, 4.643f, 13f, 4.513f)
            verticalLineTo(2.5f)
            lineToRelative(0.005f, -0.073f)
            curveToRelative(0.025f, -0.168f, 0.134f, -0.314f, 0.292f, -0.384f)
            close()
        }
    }.build()
}
