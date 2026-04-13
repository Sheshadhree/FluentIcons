package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PulseSquare24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PulseSquare24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.749f, 3f)
            curveToRelative(1.242f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(13.502f)
            curveToRelative(0f, 1.243f, -1.008f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(5.25f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineTo(5.25f)
            curveTo(3f, 4.007f, 4.007f, 3f, 5.25f, 3f)
            horizontalLineToRelative(13.499f)
            close()
            moveToRelative(0f, 1.5f)
            horizontalLineTo(5.25f)
            curveTo(4.836f, 4.5f, 4.5f, 4.836f, 4.5f, 5.25f)
            verticalLineToRelative(13.502f)
            curveToRelative(0f, 0.415f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(13.499f)
            curveToRelative(0.414f, 0f, 0.75f, -0.335f, 0.75f, -0.75f)
            verticalLineTo(5.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            close()
            moveToRelative(-10.494f, 7f)
            lineToRelative(1.557f, -3.55f)
            curveToRelative(0.251f, -0.574f, 1.036f, -0.595f, 1.333f, -0.081f)
            lineToRelative(0.05f, 0.103f)
            lineToRelative(2.381f, 5.946f)
            lineToRelative(1.003f, -2.003f)
            curveToRelative(0.112f, -0.222f, 0.324f, -0.373f, 0.566f, -0.407f)
            lineTo(15.25f, 11.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.744f)
            lineTo(17.25f, 13f)
            horizontalLineToRelative(-1.537f)
            lineToRelative(-1.542f, 3.081f)
            curveToRelative(-0.273f, 0.545f, -1.03f, 0.546f, -1.319f, 0.044f)
            lineToRelative(-0.048f, -0.1f)
            lineToRelative(-2.337f, -5.835f)
            lineToRelative(-1.035f, 2.362f)
            curveToRelative(-0.104f, 0.238f, -0.324f, 0.403f, -0.577f, 0.44f)
            lineTo(8.745f, 13f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 13f, 6f, 12.665f, 6f, 12.25f)
            curveToRelative(0f, -0.38f, 0.282f, -0.693f, 0.648f, -0.743f)
            lineTo(6.75f, 11.5f)
            horizontalLineToRelative(1.505f)
            lineToRelative(1.557f, -3.55f)
            lineToRelative(-1.557f, 3.55f)
            close()
        }
    }.build()
}
