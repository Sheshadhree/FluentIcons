package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Speaker024: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Speaker024",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.704f, 3.44f)
            curveTo(14.895f, 3.667f, 15f, 3.953f, 15f, 4.248f)
            verticalLineTo(19.75f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            curveToRelative(-0.296f, 0f, -0.582f, -0.105f, -0.808f, -0.296f)
            lineToRelative(-4.967f, -4.206f)
            horizontalLineTo(4.25f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.008f, -2.25f, -2.25f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -1.243f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(3.725f)
            lineToRelative(4.968f, -4.204f)
            curveToRelative(0.526f, -0.446f, 1.315f, -0.38f, 1.761f, 0.147f)
            close()
        }
    }.build()
}
